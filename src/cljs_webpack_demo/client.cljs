(ns cljs-webpack-demo.client
  (:require [react]
            [react-dom]))

(def h1 (react/createElement "h1" nil "Hello, world!"))

(react-dom/render h1 (.getElementById js/document "app"))
