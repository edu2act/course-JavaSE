package puKe;

import java.util.ArrayList;
	public class YouXi {
		private ArrayList<PuKe> list = new ArrayList<PuKe>();
		public void xh(){
			for(int i=0;i<13;i++){
				PuKe puke = new PuKe("黑桃",i+1);
				list.add(puke);
			}
			for(int i=0;i<13;i++){
				PuKe puke=new PuKe("红桃",i+1);
				list.add(puke);
			}
			for(int i=0;i<13;i++){
				PuKe puke=new PuKe("方片",i+1);
				list.add(puke);
			}
			for(int i=0;i<13;i++){
				PuKe puke=new PuKe("梅花",i+1);
				list.add(puke);
			}
		}
		public void DealCarls(Players e,Players s,Players t) {
			Randoms ran=new Randoms();
			int[] ranInt=new int[9];
			ranInt=ran.getRandom();
			for(int i=0;i<3;i++) {
				e.lin.add(list.get(ranInt[i]));
			}
			for(int i=3;i<6;i++) {
				s.lin.add(list.get(ranInt[i]));
			}
			for(int i=6;i<9;i++) {
				t.lin.add(list.get(ranInt[i]));
			}
		}

	}

