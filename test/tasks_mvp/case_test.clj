(ns tasks-mvp.case-test
  (:require [tasks-mvp.cases :refer :all]
            [midje.sweet :refer :all]))

(def summary "  -m, --message MESSAGE  EMPTY TASK  Task description\n  -c, --cron *****                   Cron based task schedule")

(fact "parse add"
      (parse "add" "-m" "Message")
      => {:arguments []
          :command   :add
          :errors    nil
          :options   {:message "Message"}
          :summary   summary}
      (parse "add" "-c" "0 0 * * MON")
      => {:arguments []
          :command   :add
          :errors    nil
          :options   {:cron "0 0 * * MON" :message "EMPTY TASK"}
          :summary   summary})