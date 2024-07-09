class OneDriveRunner{
public static void main(String args[]){
OneDrive.sync();
        OneDrive.sync("Documents");
        OneDrive.sync("Documents", true);
        OneDrive.sync("Documents", true, "User123");
        OneDrive.sync("Documents", true, "User123", "2024-07-09");
        OneDrive.sync("Documents", true, "User123", "2024-07-09", "12:00");
        OneDrive.sync("Documents", true, "User123", "2024-07-09", "12:00", 1);
        OneDrive.sync("Documents", true, "User123", "2024-07-09", "12:00", 1, true);
        OneDrive.sync("Documents", true, "User123", "2024-07-09", "12:00", 1, true, "v1.0");
        OneDrive.sync("Documents", true, "User123", "2024-07-09", "12:00", 1, true, "v1.0", "PC");
        OneDrive.sync("Documents", true, "User123", "2024-07-09", "12:00", 1, true, "v1.0", "PC", true);
        
}
}
