class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}
class Wizard extends Fighter {

    private boolean vulnerability = true;

    @Override
    public boolean isVulnerable() {
        return this.vulnerability;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return isVulnerable() ? 3 : 12;
    }

    public void prepareSpell() {
        this.vulnerability = false;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
