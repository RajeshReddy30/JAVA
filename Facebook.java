public class Facebook {

    String facebookNames[] = new String[5];
    int index = 0;

    public int arrLength() {
        return facebookNames.length;
    }

    public String createByFacebookNames(String names) {
        if (this.index < this.arrLength()) {
            facebookNames[index] = names;
            index++;
            return "Added Successfully";
        }
        return "Cannot Update, Array is Full";
    }

    public void readByFacebookNames() {
        for (int i = 0; i < this.arrLength(); i++) {
            System.out.println("Facebook name: " + facebookNames[i]);
        }
    }

    public String updateByFacebookNames(String oldName, String newName) {
        for (int i = 0; i < this.arrLength(); i++) {
            if (facebookNames[i] != null && facebookNames[i].equals(oldName)) {
                facebookNames[i] = newName;
                return "Updated Successfully";
            }
        }
        return "Update Failed";
    }

    public String deleteByFacebookNames(String name) {
        for (int i = 0; i < this.arrLength(); i++) {
            if (facebookNames[i] != null && facebookNames[i].equals(name)) {
                facebookNames[i] = null;
                return "Deleted Successfully";
            }
        }
        return "Not Found to Delete";
    }

    public String searchByFacebookNames(String name) {
        for (String facebookName : facebookNames) {
            if (facebookName != null && facebookName.equals(name)) {
                return "Found: " + name;
            }
        }
        return "Search Result Not Found";
    }
}
