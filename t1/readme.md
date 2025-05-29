# Lists Program - Mapping and Transformation

This Java program demonstrates how to create and manipulate lists using a specific mapping logic based on the contents of two initial lists. After processing the data, the program performs additional transformations on the resulting list.

## Problem Description

The program takes two lists:

- **`list1` (Integer List):** Contains integer values, which are used to calculate indices for retrieving values from the second list.
- **`list2` (String List):** Contains string values from which we extract values based on the computed indices.

The program uses the following logic to generate the output:

1. For each value in `list1`, calculate the index in `list2` using the formula `(list1[i] * 2) - 1`.
2. Retrieve the value at the computed index in `list2` and assign it to the corresponding index in `list3`.
3. Once `list3` is populated, the program performs an additional transformation by removing elements from the front of the list and shifting the remaining elements left until only 6 elements remain.

## Program Output

After processing the data, the program generates **`list3`**, which contains values from `list2` that correspond to the calculated indices derived from `list1`. The program then removes the first element, removes the next element, and continues until only a few elements remain.

Here’s an example of the output after the transformations:

**List3 (Resultant List):**
- p584
- wWE
- 4R2F
- 4R2F
- cSI6
- cCCjI

![img](https://github.com/CSelenetvauri/midterm2/blob/main/image.png "text")



## How It Works

1. **Initialization of Lists:**
   - `list1` contains integer values.
   - `list2` contains string values.

2. **Index Calculation:**
   - For each value in `list1`, we multiply it by 2 and subtract 1 to find the corresponding index in `list2`.

3. **Mapping to Result List:**
   - The program extracts the value from `list2` at the calculated index and adds it to `list3`.

4. **List Transformation:**
   - After `list3` is populated, the program repeatedly removes the first element, shifts all remaining elements left, and then removes the element at index 1. This process is repeated until only 6 elements remain in `list3`.

## Example

For `list1` with values `[5, 8, 9, 5, 2, 3, 2, 3, 9, 4, 8, 9, 4]`, the program uses the formula `(value * 2) - 1` to determine the indices for `list2`:

- Index 0 in `list1` has a value of `5`, resulting in index `9` in `list2`, which corresponds to `"wWE"`.
- This pattern continues for each subsequent value in `list1`.

Once the initial mapping is complete, the program performs the transformation step, which modifies `list3` further.

### Example Calculation for `list3`:

- `list1 = [5, 8, 9, 5, 2, 3, 2, 3, 9, 4, 8, 9, 4]`
- `list2 = ["XTYoX", "dsh", "9TUWT", "5Z5s", "oJWwW", "4R2F", "yhX", "cSI6", "Lf2z", "wWE", "xldV", "do9", "s5ZV", "8j6c", "X9bkO", "p584", "FBUgl", "cCCjI"]`

After applying the mapping logic, `list3` is populated with values such as:
- `"wWE"`, `"p584"`, `"cCCjI"`, `"wWE"`, and so on.

Then the transformation step reduces the list to only 6 values, resulting in:
- p584
- wWE
- 4R2F
- 4R2F
- cSI6
- cCCjI


## Requirements

- Java 8 or later
- A suitable Java development environment (e.g., IntelliJ IDEA, Eclipse, or terminal-based Java compilation)

## Usage

To run the program:

1. Clone this repository.
2. Compile the `Lists.java` file.
3. Run the program.

```bash
javac Lists.java
java oop.mid2.t1.Lists
```

## Author
Elene Tvauri

## License

[MIT](https://choosealicense.com/licenses/mit/)