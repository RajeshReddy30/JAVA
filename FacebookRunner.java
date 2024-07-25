public class FacebookRunner {

    public static void main(String[] args) {
		Facebook facebook=new Facebook();
	System.out.println("Facebook Array Size: " + facebook.arrLength());
        facebook.createByFacebookNames("rajesh");
        facebook.createByFacebookNames("Face");
        facebook.createByFacebookNames("Facebook");
        facebook.createByFacebookNames("ksnakfnl");
        facebook.createByFacebookNames("nm AFMs");
        facebook.readByFacebookNames();

        System.out.println("Update Facebook");
        String updateFacebook = facebook.updateByFacebookNames("Facebook", "FacebookUpdated");
        System.out.println(updateFacebook);
        facebook.readByFacebookNames();

        System.out.println("Delete Facebook");
        String deleteFacebook = facebook.deleteByFacebookNames("ksnakfnl");
        System.out.println(deleteFacebook);
        facebook.readByFacebookNames();

        System.out.println("Search Facebook");
        String searchFacebook = facebook.searchByFacebookNames("Facebook");
        System.out.println(searchFacebook);
}
}