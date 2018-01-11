package com.lanhuawei.myvideo;

/**
 * Created by Ivan.L LanHuaWei
 * on 2018/1/11.
 */

public class CompressHelper {

//    private String mPath;
//
//    private static CompressHelper INSTANCE=null;
//
//    private Handler mHandler;
//
//    private CompressListener mListener;
//
//    private CompressHelper() {
//
//        initHandler();
//
//    }
//
//    public static CompressHelper getInstance() {
//
//        if(INSTANCE==null) {
//
//            INSTANCE=new CompressHelper();
//
//        }
//
//        return INSTANCE;
//
//    }
//
//    public CompressHelper setPath(String path) {
//
//        mPath= path;
//
//        return this;
//
//    }
//
//    private void initHandler() {
//
//        mHandler=new Handler() {
//
//            @Override
//
//            public void handleMessage(Message msg) {
//
//                switch(msg.what) {
//
//                    case 0:
//
//                    if(mListener!=null) {
//
//                        mListener.compressStart();
//
//                    }
//
//                    break;
//
//                    case 1:
//
//                    String data = (String) msg.obj;
//
//                    if(mListener!=null) {
//
//                        mListener.compressComplet(data);
//
//                    }
//
//                    break;
//
//                    case 2:
//
//                    String videoData = (String) msg.obj;
//
//                    if(mListener!=null) {
//
//                        mListener.compressed(videoData);
//
//                    }
//
//                    break;
//
//                }
//
//            }
//
//        };
//
//    }
//
//    public CompressHelper startCompress() {
//
//        initFile();
//
//        start();
//
//        return this;
//
//    }
//
//    private void initFile() {
//
//        FilesUtils.createFile(SyncStateContract.Constants.VIDEO_PATH);
//
//        FilesUtils.createFile(SyncStateContract.Constants.VIDEO_CACHE_PATH);
//
//    }
//
//    private void start() {
//
//        mHandler.sendEmptyMessage(0);
//
//        File file =new File(mPath);
//
//        VideoCompressed videoCompressed = checkifCompressed();
//
//        if(!videoCompressed.isCompressed()) {
//
//            LocalMediaConfig.Buidler buidler =new LocalMediaConfig.Buidler();
//
//            final LocalMediaConfig config = buidler
//
//                    .setVideoPath(file.getAbsolutePath())
//
//                    .captureThumbnailsTime(1)
//
//                    .doH264Compress(new AutoVBRMode().setVelocity(BaseMediaBitrateConfig.Velocity.SUPERFAST))
//
//                    .setFramerate(15)
//
//                    .setScale(1.0f)
//
//                    .build();
//
//            new Thread(new Runnable() {
//
//                @Override
//
//                public void run() {
//
//                    OnlyCompressOverBean onlyCompressOverBean =new LocalMediaCompress(config).startCompress();
//
//                    String videoPath = onlyCompressOverBean.getVideoPath();
//
//                    mHandler.obtainMessage(1,videoPath).sendToTarget();
//
//                }
//
//            }).start();
//
//        }else{
//
//            String videoPath = videoCompressed.getVideoPath();
//
//            mHandler.obtainMessage(2,videoPath).sendToTarget();
//
//        }
//
//    }
//
//    private VideoCompressedcheckifCompressed() {
//
//        VideoCompressed videoCompressed =newVideoCompressed(false,"");
//
//        File cacheFile =new File(Constants.VIDEO_CACHE_PATH);
//
//        List files = FileUtils.listFilesInDir(cacheFile);
//
//        String videoName = StringUtil.getSubCacheName(mPath);
//
//        for(File file : files) {
//
//            String cacheName = StringUtil.getSubCacheName(file.getAbsolutePath());
//
//            if(videoName.equals(cacheName) && !TextUtils.isEmpty(videoName)) {
//
//                videoCompressed.setCompressed(true);
//
//                videoCompressed.setVideoPath(Constants.VIDEO_CACHE_PATH+ cacheName +".mp4");
//
//            }
//
//        }
//
//        return videoCompressed;
//
//    }
//
//    public void setCompressListener(CompressListener listener) {
//
//        if(listener !=null) {
//
//            mListener= listener;
//
//        }
//
//    }
//
//    public interface CompressListener {
//
//        void compressStart();
//
//        void compressComplet(String videoPath);
//
//        void compressed(String videoPath);
//
//    }

}
