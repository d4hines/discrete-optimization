(ns d4hines.disco
  (:gen-class)
  (:require [clojure.math.combinatorics :as combo]))

;; value is in millions of dollars
;; weight is in pounds

(def I
  #{{:item :a :value 3 :weight 2}
    {:item :b :value 6 :weight 3}
    {:item :c :value 10 :weight 8}
    {:item :d :value 5 :weight 5}})

(defn worst-case []
  (let [S (combo/subsets (vec I))]
    (count S)))

(defn O [])
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
