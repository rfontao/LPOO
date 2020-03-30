package com.aor.refactoring.example5;

public class RotateLeft implements Command {


    public Position execute(Position position) {
        switch(position.getDirection()){
            case 'N':
                return new Position(position.getRow(),position.getColumn(),'W');
            case 'W':
                return new Position(position.getRow(),position.getColumn(),'S');
            case 'S':
                return new Position(position.getRow(),position.getColumn(),'E');
            case 'E':
                return new Position(position.getRow(),position.getColumn(),'N');
        }

        return position;
    }


}
