# Задачи по Основам алгоритмизации и программирования
Данный проект это сборник задач для индивидуальных занятий с преподавателем.

Основная цель - обеспечить материал для работы даже с самыми слабыми студентами.

Задачи сгруппированы по темам в лабораторные работы:
- Ввод и вывод в консоль
- Арифметические выражения
- Условные выражения
- Циклы
- Работа со строками
- Массивы
- Чтение и запись в файлы
- Организация кода с помощью методов (функций)
- Исключения
- Классы и объекты
- Коллекции

Задачи бывают двух типов: бумажные и запускаемые. Бумажные (письменные) задания студент выполняет в тетради или в распечатанной странице с заданиями. Запускаемые задачи решаются написанием кода в IDE. В начале каждой лабораторной есть список контрольных вопросов.

В целом задачи не зависят от языка программирования, однако есть возможность создать варианты задач для иллюстрации особенностей некоторых языков.

Сборник не внушает какой-либо определенной философии использования исключений и классов. Он дает практические навыки по их оформлению и показывает случаи, где их использование решает какую-либо частную проблему.

## Принципы составления задач
### Не более одной новой проблемы на задачу
На каждую новую проблему - одна задача для примера и несколько похожих задач для самостоятельного решения. Порядок задач важен. Проблемы из предыдущих задач уже не новые.
### У каждой задачи должны быть приемочные тесты
Это в первую очередь нужно для того, чтобы студент мог проверить результат самостоятельно дома. Если в задаче появляется побочная нежелательная проблема, то тесты составляются так, чтобы она не проявилась. Примеры таких проблем: переполнение int, ввод пользователем букв вместо цифр. Если очень хочется, то нужно создать отдельную группу задач для иллюстрации этой проблемы.
### Задачи не ограничивают выразительные средства
Нужно избегать формулировок "реши задачу X не используя фичу Y". Основное требование к любым решениям - они проходят тесты. Любые хитрые алгоритмы нужно демонстрировать и объяснять. Для иллюстрации нестандартных конструкций и возможностей языка, можно использовать бумажные задачи.
### Порядок добавления задачи
- Определяется язык(и), в которых эта задача должна быть.
- Определяется номер лабораторной в которой она должна быть.
- С помощью файла src/numbersMap.xlsx выбирается новый номер задачи и добавляется запись с номером по аналогии.
- В папке с задачами лабораторной работы src/labX/ создается файл с задачей.
- Описывается задача.
- Задача решается на всех необходимых языках.
- Добавляются приемочные тесты.
- В файлах сборки src/labX/make_%lang%.bat для всех необходимых языков добавляются команды для включения текста задачи в лабораторную, для включения ее номера в навигацию, для копирования всех необходимых файлов в соответствующую папку.
