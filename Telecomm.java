class Telecomm {
    static String simNames[] = {null, null, null, null, null};
    static int index;

    public static boolean addSim(String sim) {
        boolean isAdded = false;
        if (sim != null) {
            simNames[index] = sim;
            index++;
            isAdded = true;
        } else {
            System.out.println("Cannot add null SIM.");
        }
        return isAdded;
    }

    public static boolean updateSimName(String existingSimName, String updatedSimName) {
        boolean isUpdated = false;
        for (int j = 0; j < index; j++) {
            if (simNames[j] != null && simNames[j].equals(existingSimName)) {
                simNames[j] = updatedSimName;
                isUpdated = true;
                break;
            }
        }
        return isUpdated;
    }

    public static void getAllSim() {
        System.out.println("Invoking getAllSim\n");
        for (int sim = 0; sim < index; sim++) {
            String ref = simNames[sim];
            System.out.println(ref);
        }
        System.out.println("End of invoking getAllSim\n");
    }

    public static boolean deleteSim(String deletedSimName) {
        System.out.println("Invoking deleteSim");
        boolean isDeleted = false;
        int simIndex = -1;

        for (int i = 0; i < index; i++) {
            if (simNames[i] != null && simNames[i].equals(deletedSimName)) {
                simIndex = i;
                break;
            }
        }

        if (simIndex != -1) {
            for (int i = simIndex; i < index - 1; i++) {
                simNames[i] = simNames[i + 1];
            }
            simNames[index - 1] = null;
            index--;
            isDeleted = true;
        }

        return isDeleted;
    }

    public static void getAllSimPostDeletion() {
        System.out.println("Invoking getAllSimPostDeletion\n");
        for (int simIndex = 0; simIndex < index; simIndex++) {
            System.out.println(simNames[simIndex]);
        }
        System.out.println("End of invoking getAllSimPostDeletion\n");
    }
}
