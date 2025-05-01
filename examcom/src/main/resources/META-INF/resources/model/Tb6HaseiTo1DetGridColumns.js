/**
 * 派生先１明細グリッド定義
 */

let Tb6HaseiTo1DetGridColumns = [];

$(function() {
    Tb6HaseiTo1DetGridColumns = [
        Column.text('HASEI_TO1_ID', Messages['Tb6HaseiTo1DetGrid.haseiTo1Id'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_TO1_BN', Messages['Tb6HaseiTo1DetGrid.haseiTo1Bn'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_DET_INFO', Messages['Tb6HaseiTo1DetGrid.haseiDetInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6HaseiTo1DetGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
