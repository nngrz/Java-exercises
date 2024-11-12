class Badge {
    public String print(Integer id, String name, String department) {
        String result = "";

        if (id == null) {
            if (department == null) { // new owner
                result = name + " - " + "OWNER";
            } else { // new employee
                result = name + " - " + department.toUpperCase();
            }
        } else if (id != null && department == null) { // owner
            result = "[" + id + "]" + " - " + name + " - " + "OWNER";
        } else { // old employee
            result = "[" + id + "]" + " - " + name + " - " + department.toUpperCase();
        }
        return result;
    }

    public static void main(String[] args) {
        Badge badge = new Badge();
        System.out.println(badge.print(734, "Ernest Johnny Payne", "Strategic Communication"));
        System.out.println(badge.print(null, "Jane Johnson", "Procurement"));
        System.out.println(badge.print(254, "Charlotte Hale", null));
        System.out.println(badge.print(null, "Charlotte Hale", null));
    }
}

/*      Another logic:
        if (department == null) {
            if (id == null) {
                result = name + " - " + "OWNER";
            } else {
                result = "[" + id + "]" + " - " + name + " - " + "OWNER";
            }
        } else if (id == null) {
            result = name + " - " + department.toUpperCase();
        } else {
            result = "[" + id + "]" + " - " + name + " - " + department.toUpperCase();
        }

 */
