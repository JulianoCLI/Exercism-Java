class Badge {
    public String print(Integer id, String name, String department) {
        if (id == null) return department == null ? name + " - OWNER": name + " - " + department.toUpperCase();
        return department == null ? "[" + id + "]" + " - " + name + " - OWNER": "[" + id + "]" + " - " + name + " - " + department.toUpperCase();
    }
}
