(ns cursive-color-in-tests.cursive-color-in-tests
  (:require [clojure.test :refer [deftest]]))

(deftest no-color
  (clojure.test/do-report {:type     :fail
                           :name     "maybe..."
                           :message  "hi"
                           :expected "7"
                           :actual   "hi"}))

(deftest color-in-actual
  (clojure.test/do-report {:type     :fail
                           :name     "maybe..."
                           :message  "hi"
                           :expected "7"
                           :actual   "\u001b[31mhi\u001b[0m"}))

(deftest color-in-expected
  (clojure.test/do-report {:type     :fail
                           :name     "maybe..."
                           :message  "hi"
                           :expected "\u001b[31mhi\u001b[0m"
                           :actual   "7"}))

(deftest color-in-message
  (clojure.test/do-report {:type     :fail
                           :name     "maybe..."
                           :message  "\u001b[31mhi\u001b[0m"
                           :expected "hi"
                           :actual   "7"}))

(deftest color-in-name
  (clojure.test/do-report {:type     :fail
                           :name     "\u001b[31mhi\u001b[0m"
                           :message  "hi"
                           :expected "hi"
                           :actual   "7"}))
