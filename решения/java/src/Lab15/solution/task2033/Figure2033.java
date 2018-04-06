package Lab15.solution.task2033;

/**
 * @author akryukov
 *         16.11.2017
 */
public interface Figure2033 {
    void shiftX(int value) throws Exception;

    void shiftY(int value) throws Exception;

    void stretchX(int value) throws Exception;

    void stretchY(int value) throws Exception;

    int maxShiftX(int bound);

    int minShiftX();

    int maxShiftY(int bound);

    int minShiftY();

    int maxStretchX(int boundX, int boundY);

    int minStretchX();

    int maxStretchY(int boundX, int boundY);

    int minStretchY();

    int getCount();
}
