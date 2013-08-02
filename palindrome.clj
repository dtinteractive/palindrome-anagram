(require '[clojure.string :as s])

(defn head-mid-tail [arr]
    [(first arr)
     (vec (reverse (rest (reverse (rest arr)))))
     (last arr)
    ])

(defn palindrome? [string]
    (let [[f m l] (head-mid-tail string)]
        (if (empty? m)
            (= f l)
            (and (= f l) (recur m)))))

(defn complex-palindrome? [string]
    (palindrome? (s/replace (s/lower-case string) #"\W" "")))

(println (palindrome? "yourmom"))
(println (palindrome? "radar"))
(println (palindrome? "aneworderbeganamoreromanagebredrowena"))
(println (complex-palindrome? "a new order began a more roman age bred rowena"))
(println (complex-palindrome? "a new order began, a more roman age bred rowena"))
(println (complex-palindrome? "A new order began, a more Roman age bred Rowena"))
