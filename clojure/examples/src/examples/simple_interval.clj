(ns examples.simple-interval
  (:require [ticktok.core :as tk])
  (:gen-class))

(defn -main
  ""
  [& args]
  (let [[host token _] args]
    (tk/ticktok :schedule {:host host
                           :token token}
                {:name "simple-interval-clojure"
                 :schedule "every.30.seconds"
                 :callback #(println "tick")})))
