package niteknightt.chess.gameplay;

import java.util.*;

public class Pawn extends Piece {

    public Pawn(Board board) {
        super(Enums.PieceType.PAWN, board);
    }

    public Pawn(Enums.Color color, int col, int row, Board board) {
        super(Enums.PieceType.PAWN, color, col, row, board);
    }

    @Override
    public void getPossibleMoves(List<Move> possibleMoves) {
        List<Move> potentialMoves = new ArrayList<Move>();

        if (_color == Enums.Color.WHITE) {
            Position target = new Position(_position.col, _position.row + 1);
            if (_board.isSquareEmpty(target)) {
                if (target.row != 7) {
                    potentialMoves.add(new Move(_position, target, Enums.PieceType.BLANK, _board));
                }
                else {
                    Move move = new Move(_position, target, Enums.PieceType.KNIGHT, _board);
                    potentialMoves.add(move);
                    move = new Move(_position, target, Enums.PieceType.BISHOP, _board);
                    potentialMoves.add(move);
                    move = new Move(_position, target, Enums.PieceType.ROOK, _board);
                    potentialMoves.add(move);
                    move = new Move(_position, target, Enums.PieceType.QUEEN, _board);
                    potentialMoves.add(move);
                }
                target = new Position(_position.col, _position.row + 2);
                if (_position.row == 1 && _board.isSquareEmpty(target)) {
                    potentialMoves.add(new Move(_position, target, Enums.PieceType.BLANK, _board));
                }
            }
            if (_position.col > 0) {
                target = new Position(_position.col - 1, _position.row + 1);
                if (!_board.isSquareEmpty(target) && !_board.isSquarePieceColor(target, _color)) {
                    if (target.row != 7) {
                        potentialMoves.add(new Move(_position, target, Enums.PieceType.BLANK, _board));
                    }
                    else {
                        Move move = new Move(_position, target, Enums.PieceType.KNIGHT, _board);
                        potentialMoves.add(move);
                        move = new Move(_position, target, Enums.PieceType.BISHOP, _board);
                        potentialMoves.add(move);
                        move = new Move(_position, target, Enums.PieceType.ROOK, _board);
                        potentialMoves.add(move);
                        move = new Move(_position, target, Enums.PieceType.QUEEN, _board);
                        potentialMoves.add(move);
                    }
                }
                else {
                    if (_board.hasEnPassantTarget()) {
                        Position enPassantTarget = _board.getEnPassantTarget();
                        if (enPassantTarget.equals(target)) {
                            potentialMoves.add(new Move(_position, target, Enums.PieceType.BLANK, _board));
                        }
                    }
                }
            }
            if (_position.col < 7) {
                target = new Position(_position.col + 1, _position.row + 1);
                if (!_board.isSquareEmpty(target) && !_board.isSquarePieceColor(target, _color)) {
                    if (target.row != 7) {
                        potentialMoves.add(new Move(_position, target, Enums.PieceType.BLANK, _board));
                    }
                    else {
                        Move move = new Move(_position, target, Enums.PieceType.KNIGHT, _board);
                        potentialMoves.add(move);
                        move = new Move(_position, target, Enums.PieceType.BISHOP, _board);
                        potentialMoves.add(move);
                        move = new Move(_position, target, Enums.PieceType.ROOK, _board);
                        potentialMoves.add(move);
                        move = new Move(_position, target, Enums.PieceType.QUEEN, _board);
                        potentialMoves.add(move);
                    }
                }
                else {
                    if (_board.hasEnPassantTarget()) {
                        Position enPassantTarget = _board.getEnPassantTarget();
                        if (enPassantTarget.equals(target)) {
                            potentialMoves.add(new Move(_position, target, Enums.PieceType.BLANK, _board));
                        }
                    }
                }
            }
        }
        else {
            Position target = new Position(_position.col, _position.row - 1);
            if (_board.isSquareEmpty(target)) {
                if (target.row != 0) {
                    potentialMoves.add(new Move(_position, target, Enums.PieceType.BLANK, _board));
                }
                else {
                    Move move = new Move(_position, target, Enums.PieceType.KNIGHT, _board);
                    potentialMoves.add(move);
                    move = new Move(_position, target, Enums.PieceType.BISHOP, _board);
                    potentialMoves.add(move);
                    move = new Move(_position, target, Enums.PieceType.ROOK, _board);
                    potentialMoves.add(move);
                    move = new Move(_position, target, Enums.PieceType.QUEEN, _board);
                    potentialMoves.add(move);
                }
                target = new Position(_position.col, _position.row - 2);
                if (_position.row == 6 && _board.isSquareEmpty(target)) {
                    potentialMoves.add(new Move(_position, target, Enums.PieceType.BLANK, _board));
                }
            }
            if (_position.col > 0) {
                target = new Position(_position.col - 1, _position.row - 1);
                if (!_board.isSquareEmpty(target) && !_board.isSquarePieceColor(target, _color)) {
                    if (target.row != 0) {
                        potentialMoves.add(new Move(_position, target, Enums.PieceType.BLANK, _board));
                    }
                    else {
                        Move move = new Move(_position, target, Enums.PieceType.KNIGHT, _board);
                        potentialMoves.add(move);
                        move = new Move(_position, target, Enums.PieceType.BISHOP, _board);
                        potentialMoves.add(move);
                        move = new Move(_position, target, Enums.PieceType.ROOK, _board);
                        potentialMoves.add(move);
                        move = new Move(_position, target, Enums.PieceType.QUEEN, _board);
                        potentialMoves.add(move);
                    }
                }
                else {
                    if (_board.hasEnPassantTarget()) {
                        Position enPassantTarget = _board.getEnPassantTarget();
                        if (enPassantTarget.equals(target)) {
                            potentialMoves.add(new Move(_position, target, Enums.PieceType.BLANK, _board));
                        }
                    }
                }
            }
            if (_position.col < 7) {
                target = new Position(_position.col + 1, _position.row - 1);
                if (!_board.isSquareEmpty(target) && !_board.isSquarePieceColor(target, _color)) {
                    if (target.row != 0) {
                        potentialMoves.add(new Move(_position, target, Enums.PieceType.BLANK, _board));
                    }
                    else {
                        Move move = new Move(_position, target, Enums.PieceType.KNIGHT, _board);
                        potentialMoves.add(move);
                        move = new Move(_position, target, Enums.PieceType.BISHOP, _board);
                        potentialMoves.add(move);
                        move = new Move(_position, target, Enums.PieceType.ROOK, _board);
                        potentialMoves.add(move);
                        move = new Move(_position, target, Enums.PieceType.QUEEN, _board);
                        potentialMoves.add(move);
                    }
                }
                else {
                    if (_board.hasEnPassantTarget()) {
                        Position enPassantTarget = _board.getEnPassantTarget();
                        if (enPassantTarget.equals(target)) {
                            potentialMoves.add(new Move(_position, target, Enums.PieceType.BLANK, _board));
                        }
                    }
                }
            }
        }

        for (Move move : potentialMoves) {
            if (_board.testMoveForLegality(move)) {
                possibleMoves.add(move);
            }
        }
    }

    @Override
    public boolean calculateHasLegalMove() {
        if (_color == Enums.Color.WHITE) {
            Position target = new Position(_position.col, _position.row + 1);
            if (_board.isSquareEmpty(target)) {
                if (target.row != 7) {
                    if (_board.testMoveForLegality(new Move(_position, target, Enums.PieceType.BLANK, _board))) {
                        return true;
                    }
                }
                else {
                    Move move = new Move(_position, target, Enums.PieceType.KNIGHT, _board);
                    if (_board.testMoveForLegality(move)) {
                        return true;
                    }
                }
                target = new Position(_position.col, _position.row + 2);
                if (_position.row == 1 && _board.isSquareEmpty(target)) {
                    if (_board.testMoveForLegality(new Move(_position, target, Enums.PieceType.BLANK, _board))) {
                        return true;
                    }
                }
            }
            if (_position.col > 0) {
                target = new Position(_position.col - 1, _position.row + 1);
                if (!_board.isSquareEmpty(target) && !_board.isSquarePieceColor(target, _color)) {
                    if (target.row != 7) {
                        if (_board.testMoveForLegality(new Move(_position, target, Enums.PieceType.BLANK, _board))) {
                            return true;
                        }
                    }
                    else {
                        Move move = new Move(_position, target, Enums.PieceType.KNIGHT, _board);
                        if (_board.testMoveForLegality(move)) {
                            return true;
                        }
                    }
                }
                else {
                    if (_board.hasEnPassantTarget()) {
                        Position enPassantTarget = _board.getEnPassantTarget();
                        if (enPassantTarget.equals(target)) {
                            if (_board.testMoveForLegality(new Move(_position, target, Enums.PieceType.BLANK, _board))) {
                                return true;
                            }
                        }
                    }
                }
            }
            if (_position.col < 7) {
                target = new Position(_position.col + 1, _position.row + 1);
                if (!_board.isSquareEmpty(target) && !_board.isSquarePieceColor(target, _color)) {
                    if (target.row != 7) {
                        if (_board.testMoveForLegality(new Move(_position, target, Enums.PieceType.BLANK, _board))) {
                            return true;
                        }
                    }
                    else {
                        Move move = new Move(_position, target, Enums.PieceType.KNIGHT, _board);
                        if (_board.testMoveForLegality(move)) {
                            return true;
                        }
                    }
                }
                else {
                    if (_board.hasEnPassantTarget()) {
                        Position enPassantTarget = _board.getEnPassantTarget();
                        if (enPassantTarget.equals(target)) {
                            if (_board.testMoveForLegality(new Move(_position, target, Enums.PieceType.BLANK, _board))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        else {
            Position target = new Position(_position.col, _position.row - 1);
            if (_board.isSquareEmpty(target)) {
                if (target.row != 0) {
                    if (_board.testMoveForLegality(new Move(_position, target, Enums.PieceType.BLANK, _board))) {
                        return true;
                    }
                }
                else {
                    Move move = new Move(_position, target, Enums.PieceType.KNIGHT, _board);
                    if (_board.testMoveForLegality(move)) {
                        return true;
                    }
                }
                target = new Position(_position.col, _position.row - 2);
                if (_position.row == 6 && _board.isSquareEmpty(target)) {
                    if (_board.testMoveForLegality(new Move(_position, target, Enums.PieceType.BLANK, _board))) {
                        return true;
                    }
                }
            }
            if (_position.col > 0) {
                target = new Position(_position.col - 1, _position.row - 1);
                if (!_board.isSquareEmpty(target) && !_board.isSquarePieceColor(target, _color)) {
                    if (target.row != 0) {
                        if (_board.testMoveForLegality(new Move(_position, target, Enums.PieceType.BLANK, _board))) {
                            return true;
                        }
                    }
                    else {
                        Move move = new Move(_position, target, Enums.PieceType.KNIGHT, _board);
                        if (_board.testMoveForLegality(move)) {
                            return true;
                        }
                    }
                }
                else {
                    if (_board.hasEnPassantTarget()) {
                        Position enPassantTarget = _board.getEnPassantTarget();
                        if (enPassantTarget.equals(target)) {
                            if (_board.testMoveForLegality(new Move(_position, target, Enums.PieceType.BLANK, _board))) {
                                return true;
                            }
                        }
                    }
                }
            }
            if (_position.col < 7) {
                target = new Position(_position.col + 1, _position.row - 1);
                if (!_board.isSquareEmpty(target) && !_board.isSquarePieceColor(target, _color)) {
                    if (target.row != 0) {
                        if (_board.testMoveForLegality(new Move(_position, target, Enums.PieceType.BLANK, _board))) {
                            return true;
                        }
                    }
                    else {
                        Move move = new Move(_position, target, Enums.PieceType.KNIGHT, _board);
                        if (_board.testMoveForLegality(move)) {
                            return true;
                        }
                    }
                }
                else {
                    if (_board.hasEnPassantTarget()) {
                        Position enPassantTarget = _board.getEnPassantTarget();
                        if (enPassantTarget.equals(target)) {
                            if (_board.testMoveForLegality(new Move(_position, target, Enums.PieceType.BLANK, _board))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }

        return false;
    }

    @Override
    public boolean isAttackingSquare(Position square) {
        if (square.equals(_position)) {
            return false;
        }
        List<Position> attackSquares = Position.getSquaresWherePawnCanAttack(square, _color);
        for (Position attackSquare : attackSquares) {
            if (attackSquare.col == _position.col && attackSquare.row == _position.row) {
                return true;
            }
        }
        return false;
    }

}
