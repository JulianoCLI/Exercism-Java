class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake== true) return false;
        return true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true) return true;
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (archerIsAwake == false && prisonerIsAwake == true) return true;
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
//        if (!archerIsAwake && !knightIsAwake &&  prisonerIsAwake &&  petDogIsPresent) return true;
//        if (!archerIsAwake && !knightIsAwake && !prisonerIsAwake &&  petDogIsPresent) return true;
//        Reparemos que esses dois aqui não importa o estado do prisioneiro, se for V ou F aqui será true:
//        if (!archerIsAwake && !knightIsAwake && petDogIsPresent) return true;

//        if (!archerIsAwake &&  knightIsAwake &&  prisonerIsAwake &&  petDogIsPresent) return true;
//        if (!archerIsAwake &&  knightIsAwake && !prisonerIsAwake &&  petDogIsPresent) return true;
//        O mesmo aqui
//        if (!archerIsAwake && knightIsAwake && petDogIsPresent) return true;

//        Do que sobrou, o knight também não importa, então fica:
        if (!archerIsAwake && petDogIsPresent) return true;
        if (!archerIsAwake && !knightIsAwake &&  prisonerIsAwake && !petDogIsPresent) return true;
        return false;
    }
}
