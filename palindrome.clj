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

(println (palindrome? "radar"))
(println (palindrome? "yourmom"))
(println (palindrome? "aneworderbeganamoreromanagebredrowena"))
