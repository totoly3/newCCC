<<<<<<< HEAD
package com.kh.ccc.board.notice.model.vo;

import java.sql.Date;
import java.util.ArrayList;

import com.kh.ccc.common.model.vo.PageInfo;




// Notice 에서 페이징을 변경할 때 사용하는 vo
public class ChangeBoardLimit {
	private ArrayList<Notice> nlist;
	private PageInfo pi;
	public ChangeBoardLimit() {
		super();
	}
	public ChangeBoardLimit(ArrayList<Notice> nlist, PageInfo pi) {
		super();
		this.nlist = nlist;
		this.pi = pi;
	}
	public ArrayList<Notice> getNlist() {
		return nlist;
	}
	public void setNlist(ArrayList<Notice> nlist) {
		this.nlist = nlist;
	}
	public PageInfo getPi() {
		return pi;
	}
	public void setPi(PageInfo pi) {
		this.pi = pi;
	}
	@Override
	public String toString() {
		return "ChangeBoardLimit [nlist=" + nlist + ", pi=" + pi + "]";
	}
	
	
	
}
=======
package com.kh.ccc.board.notice.model.vo;

import java.sql.Date;
import java.util.ArrayList;

import com.kh.ccc.common.model.vo.PageInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

// Notice 에서 페이징을 변경할 때 사용하는 vo
public class ChangeBoardLimit {
	private ArrayList<Notice> nlist;
	private PageInfo pi;
}
>>>>>>> refs/remotes/origin/ABC
