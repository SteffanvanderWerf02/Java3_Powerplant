import java.util.HashSet;

public class ControlRoom {
    private HashSet<Controlable> buildings;

    public ControlRoom() {
        this.buildings = new HashSet<Controlable>();
    }

    public HashSet<Controlable> getBuildings() {
        return buildings;
    }

    public void addBuilding(Controlable building) {
        buildings.add(building);
    }
    public boolean isNuclearReactorStable() {
        for (Controlable building : this.buildings) {
            if (!building.getStatus().equals(STATUS.STABLE)) {
                return false;
            }
        }

        return true;
    }
}