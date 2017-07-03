package puke;

public class Puku implements Comparable<Puku>{

	private String huase; 
	private String point; 
	public static String points[]={"2","3","4","5","6","7","8","9","10","j","Q","K","A"}; 
	public static String huases[]={"方片","梅花","红桃","黑桃"}; 
	public Puku(){
		
	}
	public Puku(String huase2, String point2) {
		// TODO Auto-generated constructor stub
		}
	public void Puku(String _huase,String _point){ 
		this.huase = _huase; 
		this.point = _point; 
		} 
	public String getHuase() { 
		return huase; 
		} 
	public void setHuase(String huase) { 
		this.huase = huase; 
		} 
	public String getPoint() { 
		return point; 
		} 
	public void setPoint(String point) { 
		this.point = point; 
		} 
	@Override 
	public int compareTo(Puku o) { 
		// TODO Auto-generated method stub 
		int a=0 ,b = 0, c=0 ; 
		for(int i = 0;i<points.length;i++){ 
			if(this.point.equals(points[i])){ 
				a = i;
				break; 
			}
		} 
		for(int i = 0;i<points.length;i++){ 
			if(o.point.equals(points[i])){
				b =i;
				break; 
			} 
		} 
		c = a-b; 
		if(c!=0){ 
			return c; 
			}else{ 
				int d=0,e=0,f=0; 
				for (int i =0;i<huases.length;i++){ 
					if (this.getHuase().equals(huases[i])){ 
						d = i; 
						break; 
					} 
				} 
			for (int i =0;i<huases.length;i++){ 
				if (o.getHuase().equals(huases[i])){ 
					e = i; 
					break; 
				} 
			} 
			return d-e; 
		} 
	}
	@Override 
	public boolean equals(Object obj) { 
		if (this == obj) 
			return true; 
		if (obj == null) 
			return false; 
		if (!(obj instanceof Puku)) 
			return false; 
		Puku other = (Puku) obj; 
		if (huase == null) { 
			if (other.huase != null) 
				return false;
			} else if (!huase.equals(other.huase)) 
				return false; 
		if (point == null) { 
			if (other.point != null) 
				return false;
		}	else if (!point.equals(other.point)) 
					return false; 
			return true;
		}
	}
		
	


