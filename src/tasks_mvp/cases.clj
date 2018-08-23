(ns tasks-mvp.cases
  (:require [clojure.tools.cli :refer [parse-opts]]))


(def add-option
  ;;TODO: make this option required.
  [["-m" "--message MESSAGE" "Task description"
    :default "EMPTY TASK"]
   ["-c" "--cron *****" "Cron based task schedule"]])

(defn parse [action & params]
  (case action
    "add" (assoc (parse-opts params add-option) :command :add)))