(ns clojure-example.core
  (:require [ticktok.core :as tk]))

(def config {:host "http://localhost:8080"
             :token "ticktok-zY3wpR"})

(def clock {:name "hurry.up"
            :schedule "every.3.seconds"
            :callback #(println "First clock got a tick!")})

(def ticktok (tk/ticktok :start config))

;; Scheduling clock
(ticktok :schedule clock)


;; Reschedule same clock with different callback

(ticktok :schedule {:name "hurry.up"
                    :schedule "every.3.seconds"
                    :callback #(println "Second callback got a tick!")})


;; Stop listening for new ticks

(tk/ticktok :close)
