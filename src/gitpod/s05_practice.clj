(ns gitpod.s05-practice
  (:use clojure.repl))


;; 1. Print your name (hint: use print/println)
(println "Vijay")
;; 2. Create a no-arity function that prints a message
(defn print-msg [] (println "hello default message"))
(print-msg)
;; 3. Create a function that squares a given number
(defn sq [x] (* x x))
(sq 10)
;; 4. Create a function that accepts a number and check if its in range of 1 to 10 (inclusive) (int: descending or ascending)
(defn check-range-within-ten [x] (if (<= x 10) :true :false ))
(check-range-within-ten 2)
(check-range-within-ten 11)
;; 5. Create a function that finds average of 2 given numbers (hint: nested s-expressions)
(defn avg [x y] (/ (+ x y) 2))
(avg 10 5)
;; 6. Write a function that finds max of 2 given numbers (hint: if-else)
(defn gt [x y] (max x y))
(gt 102 20)
