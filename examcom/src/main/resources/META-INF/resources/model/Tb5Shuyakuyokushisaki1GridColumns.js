/**
 * 集約抑止先１グリッド定義
 */

let Tb5Shuyakuyokushisaki1GridColumns = [];

$(function() {
    Tb5Shuyakuyokushisaki1GridColumns = [
        Column.comma('SHUYAKUYOKUSHISAKI1_ID', Messages['Tb5Shuyakuyokushisaki1Grid.shuyakuyokushisaki1Id'], 80, 'primaryKey numbering', null),
        Column.comma('TENSEIYOKUSHI_ID', Messages['Tb5Shuyakuyokushisaki1Grid.tenseiyokushiId'], 80, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5Shuyakuyokushisaki1Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb5Shuyakuyokushisaki1Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb5Shuyakuyokushisaki1Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
