(ns tasks-mvp.core
  (:require [tasks-mvp.controller :as c]
            [clojure.tools.cli :refer [parse-opts]])
  (:gen-class))

(def add-option
  [["-m" "--message MESSAGE" "Task description"]])

(def ls-option
  [["-t" "--today" "Show all task for today"]])

(defn route [params]
  (let [[action & ops] params]
    (case action
      "add" (let [o (parse-opts ops add-option)]
              (c/add (:options o)))
      "ls" (let [o (parse-opts ops ls-option)]
             (c/ls (:options o))))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (route args))
