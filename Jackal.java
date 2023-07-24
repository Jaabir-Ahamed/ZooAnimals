public class Jackal implements iAnimal {
    private int idTag;
    private final String animalType = "Jackal";
    private final int minTemperature = 15; // Assuming a minimum temperature of 15 degrees Celsius
    private final int maxTemperature = 30; // Assuming a maximum temperature of 30 degrees Celsius

    @Override
    public String getAnimalType() {
        return animalType;
    }

    @Override
    public int getIdTag() {
        return idTag;
    }

    @Override
    public void setIdTag(int anIdTag) {
        idTag = anIdTag;
    }

    @Override
    public int getMinTemperature() {
        return minTemperature;
    }

    @Override
    public int getMaxTemperature() {
        return maxTemperature;
    }
}