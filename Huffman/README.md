# Алгоритм Хаффмана для кодировани декодирования txt файлов

## Обзор
Этот проект реализует алгоритм кодирования Хаффмана для сжатия и восстановления текстовых файлов.

## Компоненты
- **HuffmanTree**: Создает дерево для кодирования и декодирования текста на основе частоты символов.
- **HuffmanNode**: Представляет узел дерева Хаффмана.
- **HuffmanEncoder**: Кодирует текст в бинарную строку с использованием дерева Хаффмана.
- **HuffmanDecoder**: Декодирует бинарную строку обратно в текст с использованием дерева Хаффмана.
- **HuffmanFileIO**: Обрабатывает чтение и запись файлов.
- **Main**: Точка входа в программу, обрабатывающая аргументы командной строки и управляющая процессами кодирования и декодирования.

## Использование

### Для кодирования файла используйте команду:

java -jar Huffman.jar encode path/to/input.txt path/to/encoded_output.txt

### Для декодирования файла используйте:

java -jar Huffman.jar decode path/to/encoded_output.txt path/to/decoded_output.txt