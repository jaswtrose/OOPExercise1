public class Bicycle
{
    private String ownerName;
    private String id;

    public Bicycle(){
        ownerName = "Unkown";
        id = "Unkown";
    }

    public String getOwnerName(){
        return ownerName;
    }

    public String getid(){
        return id;
    }

    public Bicycle(String tagNo , String name ){
        id = tagNo;
        ownerName = name;
    }

    public void setOwnerName(String name){
    ownerName = name;
    }

    public void setid(String tagNo){
    id = tagNo;
    }

}