# UML do Relógio Digital com display de 7 segmentos

```mermaid
classDiagram
    
    Relogio "1" --* "6" Display
    Display "1" --* "7" Segmento
    
    class Relogio {
        - x: int
        - y: int
        - tamanho: int
        - cor: Color
        - horas: int
        - minutos: int
        - segundos: int
        - displays: ArrayList<Display>
        + desenhar()
        + atualizarHorario()
        + validarHorario()
        + validarTamanho()
    }
    
    class Display {
        - segmentos: ArrayList<Segmento>
        + mostrarNumero(int numero)
    }
    
    class Segmento {
        - estado: boolean
        + ligarDesligarSegmento() boolean
        + isLigado()
    }

```