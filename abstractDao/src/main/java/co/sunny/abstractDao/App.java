package co.sunny.abstractDao;

import java.util.ArrayList;
import java.util.List;

import co.sunny.abstractDao.dao.BorderDao;
import co.sunny.abstractDao.dao.vo.BorderVO;

	

		/**
		 * Hello world!
		 *
		 */
		public class App 
		{
		    public static void main( String[] args )
		    {
		       BorderDao dao = new BorderDao();
		       List<BorderVO> list = new ArrayList<BorderVO>(); //리스트객체생성
		       
		       list = dao.selectALL(); //list는 dao가 가지고 있는 select를 해달라
		       
		       for(BorderVO vo : list) {
		          vo.toString();
		       }
		  }
		
	}


