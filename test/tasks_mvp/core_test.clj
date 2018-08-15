(ns tasks-mvp.core-test
  (:require [tasks-mvp.controller :refer :all]
            [midje.sweet :refer :all]))

(fact "Add new item"
      (add {}) => nil)