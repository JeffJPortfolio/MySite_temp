package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.BoardDao;
import com.javaex.vo.BoardVo;

@Service
public class BoardService {

	@Autowired
	private BoardDao boardDao;

	public List<BoardVo> exeBoardList() {

		List<BoardVo> boardList = boardDao.getBoardList();

		return boardList;
	}

	public BoardVo exeBoardOne(BoardVo boardVo) {

		BoardVo boardOne = boardDao.getBoardOne(boardVo);

		return boardOne;
	}

}
