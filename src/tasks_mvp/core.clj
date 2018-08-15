(ns tasks-mvp.core
  (:require [tasks-mvp.controller :as c])
  (:gen-class))

(def add-option
  [["-m" "--message MESSAGE" "Task description"]])

(defn route [action & params]
  (case action
    "add" (c/add params)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (route args))
