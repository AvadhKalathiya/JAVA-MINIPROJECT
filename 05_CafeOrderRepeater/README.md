# ☕ Mini-Project: Cafe Order Repeater

Let users order drinks repeatedly through a validated menu and generate a final bill with interview-grade logic and complexity awareness.

---

## 🎯 Objective
- Accept **repeated orders** until the user selects **Exit**
- Validate menu input using **relational & logical expressions**
- Assign drink prices using **switch-case**
- Generate a final bill with flags and summary

---

## 🧠 Concepts Practiced
- `while`, `do-while`, `for`
- `break` and `continue`
- Relational operators: `>=`, `<`, `==`
- Logical operators: `&&`, `!`
- String methods: `toUpperCase()`, `toLowerCase()`, `contains()`, `charAt()` (where needed)
- Multi-option flow with `switch-case`

---

## 📌 Cafe Menu
| Choice | Drink  | Price (₹) |
|--------|--------|-----------|
| 1 | Coffee | 50 |
| 2 | Tea   | 30 |
| 3 | Shake | 70 |
| 4 | Exit  | — |

---

## 🔐 Validation Rules
- `switch` selects price
- `continue` skips invalid input
- `break` exits ordering anytime
- Discount/flags decided using relational + logical checks

---

## 🧾 Sample Output
cafe menu:

coffee (₹50)
tea (₹30)
shake (₹70)
exit

enter menu choice: 1
you ordered COFFEE

enter menu choice: -3
invalid choice skipped!

enter menu choice: 3
you ordered SHAKE

enter menu choice: 2
you ordered TEA

enter menu choice: 4
exiting menu...

final bill:

total orders (attempts counted): 6
total payable: ₹250
note: thanks for ordering!
high bill flag: true


---

## 📊 Complexity Analysis
- **Time Complexity:** `O(n)` → each order is processed once, bill printing loops run `n` times
- **Space Complexity:** `O(1)` auxiliary → uses only counters, flags, and references

---

## 💡 What This Project Teaches
- `do-while` ensures the **first order attempt always runs**
- `while` repeats the menu until exit
- `break` allows **instant exit control**
- `continue` skips **invalid choices safely**
- Flags use **relational + logical reasoning**
- String methods transform output for **consistent reporting**
- `for` loop prints bill decorations and summary structure

---

## 🔥 Interview-Ready Explanation
> *“I take the first input using `do-while`, repeat orders using `while`, exit via `break`, skip invalid input via `continue`, select prices via `switch-case`, compute flags using relational + logical operators, and format output using String methods. The logic runs in `O(n)` time and uses `O(1)` extra space.”*

---

## ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement-Focused Mini Projects
