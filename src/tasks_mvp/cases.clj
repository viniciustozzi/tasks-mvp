(ns tasks-mvp.cases
  (:require [clojure.tools.cli :refer [parse-opts]]))


(def add-option
  [["-m" "--message MESSAGE" "Task description"]])

(defn parse [action & params]
  (case action
    "add" (assoc (parse-opts params add-option) :command :add)))