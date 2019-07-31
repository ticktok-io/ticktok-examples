(ns examples.manual-tick
  (:require [ticktok.core :as tk])
  (:gen-class))

(defn -main
  ""
  [& args]
  (let [[host token _] args
        ticktok (tk/ticktok :start {:host host
                                    :token token})]

    (ticktok :schedule {:name "non-scheduled-tick"
                        :schedule "@never"
                        :callback #(println "tick")})

    (ticktok :tick {:name "non-scheduled-tick"
                   :schedule "@never"})))
