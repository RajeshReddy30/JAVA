class InstagramRunner{
public static void main(String args[]){
        Instagram.post();
        Instagram.post("Having a great time!");
        Instagram.post("Having a great time!", "New York");
        Instagram.post("Having a great time!", "New York", "@friend");
        Instagram.post("Having a great time!", "New York", "@friend", "Vintage");
        Instagram.post("Having a great time!", "New York", "@friend", "Vintage", "@friend");
        Instagram.post("Having a great time!", "New York", "@friend", "Vintage", "@friend", "#fun");
        Instagram.post("Having a great time!", "New York", "@friend", "Vintage", "@friend", "#fun", 100);
        Instagram.post("Having a great time!", "New York", "@friend", "Vintage", "@friend", "#fun", 100, 50);
        Instagram.post("Having a great time!", "New York", "@friend", "Vintage", "@friend", "#fun", 100, 50, true);
        Instagram.post("Having a great time!", "New York", "@friend", "Vintage", "@friend", "#fun", 100, 50, true, true);
        //Instagram.post("Having a great time!", "New York", "@friend", "Vintage", "@friend", "#fun", 100, 50, true, true, "Reel123");
}}