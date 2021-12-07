package heech.hellcoding.board.service;

import heech.hellcoding.board.domain.Board;
import heech.hellcoding.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public List<Board> getAllBoard() {
        return boardRepository.findAll();
    }
}
