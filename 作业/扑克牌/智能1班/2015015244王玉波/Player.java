package poker;

public class Player {
	  private Integer id;//玩家ID
	  private String name;//玩家姓名

	    public Player(Integer id,String name){
	        this.id = id;
	        this.name = name;
	    }

	    public Integer getId() {
	        return id;
	    }
	    public void setId(Integer id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
}
