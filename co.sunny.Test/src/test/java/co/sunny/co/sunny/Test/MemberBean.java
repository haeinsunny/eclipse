package co.sunny.co.sunny.Test;

public class MemberBean {
	
		private String id; // set,get을 통해서 값을 가져올수밖애없음
		private String name;

		public MemberBean() {
		}

		public MemberBean(String id, String name) {  
    		this.id = id;  //내 id에는  넘어온 id를
    		this.name = name;  //내 네임에는 넘어온 네임을
    		 
		}
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
	}
