/**
 * 派生先２明細グリッド定義
 */

let Tb6HaseiSaki2DetGridColumns = [];

$(function() {
    Tb6HaseiSaki2DetGridColumns = [
        Column.text('HASEI_SAKI2_ID', Messages['Tb6HaseiSaki2DetGrid.haseiSaki2Id'], 80, 'primaryKey numbering', null),
        Column.text('HASEI_SAKI2_BN', Messages['Tb6HaseiSaki2DetGrid.haseiSaki2Bn'], 80, 'primaryKey numbering', null),
        Column.text('HASEI_SAKI2_DET_INFO', Messages['Tb6HaseiSaki2DetGrid.haseiSaki2DetInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6HaseiSaki2DetGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
