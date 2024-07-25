public class Meta {

    String metaNames[] = new String[5];
    int index = 0;

    public int arrLength() {
        return metaNames.length;
    }

    public String createByMetaNames(String names) {
        if (this.index < this.arrLength()) {
            metaNames[index] = names;
            index++;
            return "Added Successfully";
        }
        return "Cannot Update, Array is Full";
    }

    public void readByMetaNames() {
        for (int i = 0; i < this.arrLength(); i++) {
            System.out.println("Meta name: " + metaNames[i]);
        }
    }

    public String updateByMetaNames(String oldName, String newName) {
        for (int i = 0; i < this.arrLength(); i++) {
            if (metaNames[i] != null && metaNames[i].equals(oldName)) {
                metaNames[i] = newName;
                return "Updated Successfully";
            }
        }
        return "Update Failed";
    }

    public String deleteByMetaNames(String name) {
        for (int i = 0; i < this.arrLength(); i++) {
            if (metaNames[i] != null && metaNames[i].equals(name)) {
                metaNames[i] = null;
                return "Deleted Successfully";
            }
        }
        return "Not Found to Delete";
    }

    public String searchByMetaNames(String name) {
        for (String metaName : metaNames) {
            if (metaName != null && metaName.equals(name)) {
                return "Found: " + name;
            }
        }
        return "Search Result Not Found";
    }
}
