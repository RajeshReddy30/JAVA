public class MetaRunner {

    public static void main(String[] args) {
        Meta meta = new Meta();

        System.out.println("Meta Array Size: " + meta.arrLength());
        meta.createByMetaNames("Meta");
        meta.createByMetaNames("facebook");
        meta.createByMetaNames("whatsapp");
        meta.createByMetaNames("meta ai");
        meta.createByMetaNames("meta_vision");
        meta.readByMetaNames();

        System.out.println("Update Meta");
        String updateMeta = meta.updateByMetaNames("whatsapp", "MetaUpdated");
        System.out.println(updateMeta);
        meta.readByMetaNames();

        System.out.println("Delete Meta");
        String deleteMeta = meta.deleteByMetaNames("whatsapp");
        System.out.println(deleteMeta);
        meta.readByMetaNames();

        System.out.println("Search Meta");
        String searchMeta = meta.searchByMetaNames("Meta");
        System.out.println(searchMeta);
	}
}
