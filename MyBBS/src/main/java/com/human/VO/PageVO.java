package com.human.VO;

public class PageVO {
	private int startNo;
	private int endNO;
	

	private int perPageNum;
	private Integer page;
	private int totalCount;
	private int endPage;
	private int startPage;
	private boolean prev;
	private boolean next;
	// 검색용 변수
	private String searchType;
	private String searchKeyword;

	private void calcPage() {
		int tempEnd = (int) (Math.ceil(page / (double) this.perPageNum) * this.perPageNum);
		this.startPage = (tempEnd - this.perPageNum) + 1;
		if (tempEnd * this.perPageNum > this.totalCount) {
			this.endPage = (int) Math.ceil(this.totalCount / (double) this.perPageNum);
		} else {
			this.endPage = tempEnd;
		}
		this.prev = this.startPage != 1;
		this.next = this.endPage * this.perPageNum < this.totalCount;
	}
	public int getEndNO() {
		endNO = (this.page) * perPageNum;
		return endNO;
	}

	public void setEndNO(int endNO) {
		this.endNO = endNO;
	}
	public int getStartNo() {
		startNo = (this.page-1) * perPageNum+1;
		return startNo;
	}

	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcPage();
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

}
