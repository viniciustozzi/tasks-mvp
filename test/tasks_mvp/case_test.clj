(ns tasks-mvp.case-test
  (:require [tasks-mvp.cases :refer :all]
            [midje.sweet :refer :all]))

(fact "parse add"
  (parse "add" "-m" "Message")
    => {:arguments []
        :command   :add
        :errors    nil
        :options   {:message "Message"}
        :summary   "  -m, --message MESSAGE  Task description"})