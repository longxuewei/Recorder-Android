/*
 * Copyright 2018 LiJun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.junzz.lib.recorder;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;

import java.io.File;
import java.io.IOException;

/**
 * 录制音频。
 */
@Keep
public interface Recorder {

    /**
     * 准备录音机开始捕捉和编码数据。
     *
     * @param file 音频保存的文件。
     * @throws IOException 目标文件不可用。
     */
    void prepare(@NonNull File file) throws IOException;

    /**
     * 开始捕获数据并将其编码到 prepare() 指定的文件中。
     */
    void start();

    /**
     * 停止录制。
     */
    void stop();

    /**
     * 释放与此 Recorder 对象关联的资源。
     */
    void release();

}
