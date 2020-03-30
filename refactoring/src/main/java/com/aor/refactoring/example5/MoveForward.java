package com.aor.refactoring.example5;

public class MoveForward implements Command {

    public Position execute(Position position) {
        switch(position.getDirection()){
            case 'N':
                return new Position(position.getRow() - 1, position.getColumn(), position.getDirection());
            case 'E':
                return new Position(position.getRow(),position.getColumn() + 1, position.getDirection());
            case 'S':
                return new Position(position.getRow() + 1, position.getColumn(), position.getDirection());
            case 'W':
                return new Position(position.getRow(),position.getColumn() - 1, position.getDirection());
        }

        return position;
    }
}
