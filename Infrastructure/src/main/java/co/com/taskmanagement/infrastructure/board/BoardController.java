package co.com.taskmanagement.infrastructure.board;

import co.com.taskmanagement.domain.board.Board;
import co.com.taskmanagement.domain.board.BoardInputPort;
import co.com.taskmanagement.infrastructure.application.URIManager;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/boards")
@AllArgsConstructor
public class BoardController {

  private final BoardInputPort boardInputPort;

  private final BoardAdapter boardAdapter;

  @GetMapping("/{id}")
  public ResponseEntity<BoardResponseDTO> getBoardById(@PathVariable Long id) {
    Board board = boardInputPort.getBoardById(id);
    return ResponseEntity.ok().body(boardAdapter.boardToBoardResponseDTO(board));
  }

  @PostMapping
  public ResponseEntity<BoardResponseDTO> createBoard(@RequestBody BoardRequestDTO requestBody) {
    Board board = boardInputPort.createBoard(boardAdapter.boardRequestDTOToBoard(requestBody));
    BoardResponseDTO boardResponseDTO = boardAdapter.boardToBoardResponseDTO(board);

    return ResponseEntity.created(URIManager.of().createURIFromPath("/{id}", boardResponseDTO.getId())).body(boardResponseDTO);
  }

}
